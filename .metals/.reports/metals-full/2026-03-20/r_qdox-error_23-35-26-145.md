error id: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/old/functions.java
file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/old/functions.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[4,19]

error in qdox parser
file content:
```java
offset: 26
uri: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/old/functions.java
text:
```scala

/

    public static v@@oid printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void main(String[] args) { //void refers return type it means empty value
        // access modifier refers public static & main is the function
        printhelloworld();
        // main function mei call krne k liye function ka nam likhna hota
    }
}
*/
/* 
// Addition 
// ****CALL BY VALUE IS A COPY NOT ORIGINAL
// ***CALL BY VALUE WORKS OB JAVA AND C++ WORKS ON CALL BY REFERENCE(ORIGINAL)
// import java.util.Scanner;
public class functions{
    public static int calculatesum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args) {
        int c=5;
        int d=10;
        swap(c,d);
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            calculatesum(a,b);
            System.out.println("sum");
        }
    }
}
*/
/* 
// PRODUCT OF a&b
public class functions{
    public static int product(int a, int b){
      int mul=a*b;
      return mul;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int mul=product(a,b);
        System.out.println("The product is:"+mul);
        mul=product(10,20);
        System.out.println("product is:"+mul);     
    }
}
*/

// // Factorial of a number,n(ex.=n!)
// public class functions{
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*1;
//         }
//     return f;

//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(4));
//     }
// }

// Binomial coefficient
public class functions{
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*1;
        }
        return f;
    }
    public static int binocoeff(int n,int r){
        int a= factorial(n);
        int b= factorial(r);
        int c= factorial(n-r);

        int d=(a/(b*c));
        return d;
    }

    public static void main(String[] args) {
        System.out.println(binocoeff(5, 2));
    }
}

```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:940)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

QDox parse error in file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/old/functions.java