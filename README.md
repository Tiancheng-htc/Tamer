## Fine-grained Code Clone Detection with Block-based Splitting of Abstract Syntax Tree

In this paper, we design Tamer, a scalable and fine-grained tree-based syntactic code clone
detector. Specifically, we propose a novel method to transform the complex abstract syntax tree into simple subtrees. It can accelerate the process of detection and implement the fine-grained analysis of clone pairs to locate the concrete clone parts of the code.

Tamer is mainly comprised of three phases: AST Extraction, Clone candidate filter and Clone verification.

1. AST Extraction: The purpose of this phase is to apply static analysis(we use javaparser in our tool) to generate the corresponding AST. The input of this phase is a method and the output is an AST.
2. Clone candidate filter: The purpose of this phase is to select out the candidate by using AST based n-grams and inverted index. The input of this phase is the AST presentation of source code and output is the candidate clone pairs.
3. Clone verification: The purpose of this phase is to determine whether two methods are true clone. The input of this phase is the candidate clone pairs and the output is to report the detection results.

## Project Structure

Tamer  
|-- Func.java    	// implement a class of AST including splitting the AST and calculate the similarity of subtrees. 
|-- TaskList.java     // implement a mutithread 
|-- main.java   // implement the Classification phase  

## Reproduce



### Use our tool

You can use our tool in the following command

```java
java -Dfiledir=/root/data/id2sourcecode -Doutputpath=/root/data/result.csv -jar finals-1.0-SNAPSHOT.jar
    
-Dfiledir refers to the methods set you want to detect
-Doutputpath refers to filepath of the detecting result you want to store
```

