/*

    interface Poet {
        default void write() {
            System.out.println("Poet's default method");
        }
    }

    interface Writer {
        default void write() {
            System.out.println("Writer's default method");
        }
    }

    public class DiamondProbleInJava8 implements Poet, Writer{

        public static void main(String args[]){
            DiamondProbleInJava8 john = new DiamondProbleInJava8();
            john.write();  // which write method to call, from Poet
            // or, from Writer
        }

//compiler error
    }*/

