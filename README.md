-------------------------------------------------------------------------
Starter Code and GUI Application for Course 3 in the
#Java Programming: Object Oriented Design of Data Structures Specialization: Advanced Data Structures in Java
https://www.coursera.org/learn/advanced-data-structures
Authored by UCSD MOOC Team:
Mia Minnes, Christine Alvarado, Leo Porter, Alec Brickner
and Adam Setters
Date: 12/16/2015

Modified by Cam Gillespie for Coursera course starting March 2016

DESCRIPTION

The files provided are skeleton code, as well as grading previews and 
testing files to be used in completing the course programming 
assignments. Additionally, you are provided a runnable JavaFX program 
which will help to test and demonstrate your implementations.

FILES BY WEEK

Below are the files introduced in each week and used in each week
of the course. See file for description...

Week 1 : Introduction to the course and graphs
==============================================
basicgraph.Graph.java
basicgraph.GraphAdjList.java
basicgraph.GraphAdjMatrix.java

Week 2 : Class design and simple graph search
==================================================
Notes:
- Describe how a 2D maze problem can represented as a graph
  - available spaces are nodes in the graph
  - edges are connected to nodes depending on the movement rules
- Represent a geographic map as a graph
- Perform Depth-first Search (DFS) and Breadth-first search (BFS) on a graph
  - DFS: search all the way along a single path until it gets stuck or reaches it's goal. Keep track of visited nodes. Backtrack when becomes stuck.
  - keep track of where to search next = stack
  - keep track of nodes visited = hashset - constant time add, remove and find
  - keep track of path from start to goal = hashset
  - DFS Algorithm:
```
DFS(S, G)
  initialize: stack, visited Hashset, and parent Hashset
  Push S onto the stack and add to visited
  while stack is not empty:
    pop node curr from top of stack
    if curr== G return parent map
      for each of curr's neighbors, n, not in visited set:
        add n to visited set
        add curr as n's parent in parent map
        push n onto the stack
 ```

  - BFS uses a queue instead of a stack
  - a queue uses first in (enqueue) last out (dequeue)
```
BFS(S, G)
  initialize: stack, visited Hashset, and parent Hashset
  enqueue S onto the stack and add to visited
  while stack is not empty:
    dequeue node curr from top of queue
    if curr== G return parent map
      for each of curr's neighbors, n, not in visited set:
        add n to visited set
        add curr as n's parent in parent map
        enqueue n onto the stack
```
- Implement the code for DFS and BFS
- Analyze and compare the worst-case running time of DFS and BFS
- Describe how the ADTs Stack and Queue work
  - stack: list where you add and remove from one end only, push = add, pop = remove. Last in first out (LIFO)
- Describe how Stacks are used in DFS and how Queues are used in BFS
- Design classes to represent a grid-based graph
  - 
- Explain the concepts of redesign and refactoring
  - a method should have a single purpose, action
- Critique aspects of code design
- Redesign and refactor code for better design


roadgraph.MapGraph.java
week2example.Maze.java
week2example.MazeLoader.java
week2example.MazeNode.java

Utility files
=============
geography.GeographicPoint.java
geography.RoadSegment.java
util.GraphLoader.java


