import java.util.Scanner;
    class Pubg {
        private String name;
        private String username;
        private String level;
        private int highscore;

        public Pubg(String name, String username, String level, int highscore) {
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public String getLevel() {
            return level;
        }

        public int getHighscore() {
            return highscore;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setHighscore(int highscore) {
            this.highscore = highscore;
        }

        public void pubg(String Name, String Username, String Level, int Highscore) {
            this.name = Name;
            this.username = Username;
            this.level = Level;
            this.highscore = Highscore;
        }

        @Override
        public String toString() {
            return
                    ("Name" + getName() + "Username" + getUsername() + "Level" + getLevel() + "Highscore" + getHighscore());
        }

        public static class Test {
            public static void main(String[] args) {
                System.out.println("enter the number of players");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                scanner.nextLine();
                if (n > 0 && n < 100) {
                    Pubg[] p = new Pubg[n];
                    for (int i = 0; i < n; i++) {
                        String name = scanner.nextLine();
                        String username = scanner.nextLine();
                        String level = scanner.nextLine();
                        int highscore = scanner.nextInt();
                        scanner.nextLine();
                        p[i] = new Pubg(name, username, level, highscore);


                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println(p[i]);
                    }


                }


            }
        }
    }



