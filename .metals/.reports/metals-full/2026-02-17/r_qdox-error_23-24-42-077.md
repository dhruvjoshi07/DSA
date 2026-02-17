error id: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/javalearning/new/binarysearch.java
file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/javalearning/new/binarysearch.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[75,1]

error in qdox parser
file content:
```java
offset: 1740
uri: file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/javalearning/new/binarysearch.java
text:
```scala
// condition=sorted arrays (descending or ascending)
// start,mid,end(three parametrs)
/* 
pseudo code-
 start=0,end=n-1
 while(start<=end)
    find mid
    compare mid & key
       mid==key (found)
       mid>key (left)(end=mid-1)
       mid<key(right)(start=mid+1)
*/
/* 
public class binarysearch {

    public static int search(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]== key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16,18,20};
        int key=18;
        System.out.println("The index key is on:"+ search(num,key));
    }
}
*/
public class binarysearch {

    static int search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        int x = 7;

        int index = search(arr, x);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + index);
    }
}

//templete
i@@nt left = 0, right = nums.length - 1;
while (left <= right) {
    // Avoid overflow: same as (left + right) / 2
    int mid = left + (right - left) / 2;
    
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
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
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:936)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

QDox parse error in file:///C:/Users/DHRUV%20JOSHI/OneDrive/Desktop/javalearning/new/binarysearch.java