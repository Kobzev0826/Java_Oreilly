public class TestExceptions {

    public static void main(String [] args){
        String test = "yes";
        try{
            System.out.println("Start try");
            doRisky(test);
            System.out.println("End try");
        }catch(Exception ex){
            System.out.println("Exception");
        }
        finally{
            System.out.println("endofmain");
        }
    }

    static void doRisky(String test) throws Exception {
        System.out.println("Start of dangerous method");
        if ("yes".equals(test)){
            throw new Exception();
        }
        System.out.println("End of dangerous method");
        return;
    }

}
