Algorithm
1. Create an interface that defines the common protocol/contract
2. Create classes that implement the interface and provide their own functionality
3. Create a client that HAS-A instance(using composition) of that interface and makes use of its methods
4. Initialize the client class with an instance of the delegate (using polymorphism)
