package Task4;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    public class TopPassword {

        private List<PasswordHolder> passList = new ArrayList<>();

        public void createTopTenList() {
            try {
                for (String line : read("src/Task4/loginPassword.csv").split("\n")) {
                    String tempPass = line.split(",")[1];
                    checkPass(tempPass);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            passList.sort(new SortByCounter());
            System.out.println("Топ 10 самых частых паролей:");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". " + passList.get(i).getPassword() + ", совпадений - " + passList.get(i).getCounter());
            }
        }

        private void checkPass(String tempPass) {
            for (PasswordHolder pass : passList) {
                if (pass.getPassword().equals(tempPass)) {
                    pass.adjustCounter();
                    return;
                }
            }
            passList.add(new PasswordHolder(tempPass));
        }

        private String read(String fileName) throws FileNotFoundException {
            StringBuilder sb = new StringBuilder();
            exists(fileName);
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)), "UTF-8"));
                try {
                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                } finally {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return sb.toString();
        }

        private void exists(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getName());
            }
        }

        private class PasswordHolder {
            private final String password;
            private int counter = 1;

            public PasswordHolder(String password) {
                this.password = password;
            }

            public void adjustCounter() {
                counter++;
            }

            public int getCounter() {
                return counter;
            }

            public String getPassword() {
                return password;
            }
        }

        private class SortByCounter implements Comparator<PasswordHolder> {
            public int compare(PasswordHolder a, PasswordHolder b) {
                return b.getCounter() - a.getCounter();
            }
        }
    }




