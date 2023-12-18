public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(Registration.registration("login1", "password1", "password 1"));

        } catch (WrongLoginException | WrongPasswordException  e){
            System.out.println(e.getMessage());
        }
        System.out.println(" ");

        try {
            // Через бесконечный цикл:
//            while(true){
//                System.out.println("Задание *: Написать try/catch/finally, в котором finally вызван не будет.");
//            }
            //Через оператор System.exit(), который немедленно завершает выполнение программы

            if (true){
                System.out.println("Задание *: Написать try/catch/finally, в котором finally вызван не будет.");
                System.exit(0);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Вызвался блок finally");
        }

    }
}