## Creating Threads

	- There are two ways creating threads
		- By implementing runnable interface
			- Create a new thread and by passing instance of new object that implemented runnable
			- Running the method start on the new instance of the thread class
		- By extending thread class 
			- implement the run method using the required logic
			- create a new instance of the new class
			- Run the start method of the instance; 

## Issues with Runnable instance
	- Cannot return result when it terminates. i.e, when the run method completes.

## Callable interface
	- Since runnable run method returns a void, Callable interface is present to address this issue
	- When the call() method completes, Answer must me stored in an object known to the main thread
	- 

## Future
	- Future is an object that stores result of callable. 
	- Future holds the result of callable
	- A Future is basically to have a main thread keep track of result from other threads

Callable and future are two different things 
Callable is similar to runnable; it just encapsulates a task that is meant to run on another thread
To create a thread you need Runnable and to obtain a result you need a future.

## Locking and Synchronization

Multicore CPU's have seperate caches(fast memory) attached to each processor core. Locking requires these to be synchronized.

## Stream(java.util.stream)

## Functions in JAVA


## Behaviour parameterization

is a software development pattern that lets you handle frequent changes . It means passing a block of code and making it avaiable with out executing it. This block of code can later be called by other parts of the method, This is delaying the execution. 





