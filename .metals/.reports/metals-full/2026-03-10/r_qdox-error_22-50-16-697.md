error id: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/array/que/PrintArray.java
file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/array/que/PrintArray.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[45,3]

error in qdox parser
file content:
```java
offset: 1019
uri: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/array/que/PrintArray.java
text:
```scala
/* 
// Shopping price java
package que;

public class sp {
    public class Shopping {
    public static void main(String[] args) {
        int[] prices = {120, 250, 75, 300, 90, 150};

        int total = 0;
        int max = prices[0];
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];

            if (prices[i] > max) {
                max = prices[i];
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        System.out.println("Total Bill: " + total);
        System.out.println("Most Expensive Item: " + max);
        System.out.println("Cheapest Item: " + min);
    }
}

}

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

*/@@
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

QDox parse error in file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/learning/javalearning/new/array/que/PrintArray.java