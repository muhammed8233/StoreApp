package School;

import java.util.ArrayList;

import java.util.UUID;

         class Unique {
            String id;
            String name;
            int score;

            public Unique(String name, int score) {
                this.id = UUID.randomUUID().toString();  // Unique ID
                this.name = name;
                this.score = score;
            }

            public void display() {
                System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score);
            }
        }

        public class UniqueUuid {
            public static void main(String[] args) {
                ArrayList<Unique> students = new ArrayList<>();

                students.add(new Unique("Alice", 85));
                students.add(new Unique("Bob", 90));
                students.add(new Unique("Charlie", 78));

                for (Unique s : students) {
                    s.display();
                }
            }
        }






