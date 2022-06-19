public class Ineuron_pattern{
  public static void main(String []args){
      //I pattern
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==3||i==1||i==5)
            System.out.print("* ");
            else
            System.out.print("  ");
           } System.out.println();
        } System.out.println("");
            //n paTtern
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
           if(j==1||i==2&&j==2||i==3&&j==3||i==4&&j==4||j==5)
            System.out.print("* ");
            else
            System.out.print("  ");
             } System.out.println();
        } System.out.println("");
        //E pattern
         for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==1||i==1||i==3||i==5)
            System.out.print("* ");
            else
            System.out.print("  ");
             }System.out.println();
        }System.out.println("");
        //U Pattern
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==1||i==5||j==5)
            System.out.print("* ");
            else
            System.out.print("  ");
             }System.out.println();
        }System.out.println("");
         //R Pattern
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==1||i==4&&j==3||i==2&&j==5||i==5&&j==5||i==3||i==1)
            System.out.print("* ");
            else
            System.out.print("  ");
             }System.out.println();
        }System.out.println("");
        //O Pattern
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==1||i==1||j==5||i==5)
            System.out.print("* ");
            else
            System.out.print("  ");
             }System.out.println();
        }System.out.println("");
         //n paTtern
        for(int i=1;i<=5;i++){
             for(int j=1;j<=5;j++){
            if(j==1||i==2&&j==2||i==3&&j==3||i==4&&j==4||j==5)
            System.out.print("* ");
            else
            System.out.print("  ");
             }System.out.println();
        }System.out.println("");
     }
}
