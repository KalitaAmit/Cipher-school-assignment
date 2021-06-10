// (1)ans

//package com.company;
// public class Amit
// {
//
// 	public static void printStars(int n)
// 	{
// 		int i, j;
// 		for(i=0; i<n; i++)
// 		{
// 			for(j=0; j<=i; j++)
// 			{
//
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// }
//
// 	public static void main(String args[])
// 	{
// 		int n = 4;
// 		printStars(n);
// 	}
// }



//(2)Ans

//package com.company;
//public class Amit
//{
//    public static void main(String[] args)
//    {
//        int rows=4;
//        for (int i= rows-1; i>=0 ; i--)
//        {
//            for (int j=0; j<=i; j++)
//            {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
//}




//(3)Ans


//package com. company;
//public class Amit
//
//{
//    public static void main(String[] args)
//    {
//        int i, j, rows;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows you want to print: ");
//        rows = sc.nextInt();
//        for (i= 0; i<= rows-1; i++)
//        {
//            for (j=0; j<=i; j++)
//            {
//                System.out.print("*"+ " ");
//            }
//            System.out.println("");
//        }
//        for (i=rows-1; i>=0; i--)
//        {
//            for(j=0; j <= i-1;j++)
//            {
//                System.out.print("*"+ " ");
//            }
//            System.out.println("");
//        }
//    }
//}


// (4)Ans

//package com.company;
// public class Amit{
// 	public static void printStars(int n)
// 	{
// 		int i, j;
// 		for(i=0; i<n; i++)
// 		{
// 			for(j=2*(n-i); j>=0; j--)
// 			{
// 				System.out.print(" ");
// 			}
//
// 			for(j=0; j<=i; j++)
// 			{
// 				System.out.print("* ");
// 			}
//
// 			System.out.println();
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		int n = 4;
// 		printStars(n);
// 	}
// }



//(5)Ans Pyramid Pattern

//package com.company;
//public class Amit
//{
//    public static void printTriagle(int n)
//    {
//
//        for (int i=0; i<n; i++)
//        {
//            for (int j=n-i; j>1; j--)
//            {
//                System.out.print(" ");
//            }
//            for (int j=0; j<=i; j++ )
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String args[])
//    {
//        int n = 4;
//        printTriagle(n);
//    }
//}



//(6)Ans


//package com.company;
//public class Amit
//{
//public static void main(String args[])
//        {
//        int i, j,number, n=5;for(i=0; i<n; i++)
//        {
//        number=1;for(j=0; j<=i; j++)
//        {
//        System.out.print(number+ " ");
//        number++;
//        }
//        System.out.println();
//        }
//        }
//        }



//(7)Ans


// package com.company;
// public class Amit
//{
//    public static void main(String[] args)
//    {
//        int i, j, k = 1;
//        for (i = 1; i <= 7; i++)
//        {
//            for (j = 1; j< i + 1; j++)
//            {
//                System.out.print(k++ + " ");
//            }
//            System.out.println();
//        }
//    }

