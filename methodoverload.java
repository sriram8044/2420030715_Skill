class methodoverload {
   
        public int sum(int a,int b){
            return a+b;

        }
        void sum( float a, float b){
            float c=a+b;
            System.out.println(c);

        }
        void sum( int a ,double b , float c){
            double d= a+b+c;
            System.out.println(d);
        }
        public double sum(double a ,double b){
            return (a+b);
        }
    
         public static void main (String[] args){
            methodoverload ob= new methodoverload();
            System.out.println(ob.sum(10, 20));
            ob.sum(2.5f, 3.5f);
            ob.sum(10,20.5 ,3.5f);
            System.out.println(ob.sum(30.25,60,25));
}
}
