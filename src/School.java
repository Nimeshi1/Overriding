public class School {
        public void change () {
            System.out.println("School is open");
        }
    }
    class University extends School {
        public void change () {
            System.out.println("University is open too");
        }
    }
    class student {
        public static void main(String[] args) {
            School a = new School ();
            School b = new University ();
            a.change();
            b.change();
        }
    }

