What is Apache Kafka?
Apache Kafka is a distributed event streaming platform designed to handle large-scale data processing in real-time. 
It is widely used for building real-time data pipelines, streaming applications, and event-driven architectures.

Kafka Architecture Components
1.  Brokers: Kafka runs in a cluster of nodes called brokers, where each broker processes and stores messages.
2.  Topics: Data in Kafka is organized into topics, which act as categories or streams where messages are sent.
3.  Partitions: A topic is split into multiple partitions, allowing Kafka to scale horizontally.
4.  Producers: Producers are responsible for sending data to Kafka topics.
5.  Consumers: Consumers subscribe to Kafka topics and retrieve messages in real-time.
6.  Zookeeper: Kafka uses Apache Zookeeper for managing metadata, leader elections, and cluster coordination.

Durability and Fault Tolerance
1. Kafka ensures durability by writing data to disk before acknowledging receipt.
2. Messages are replicated across multiple brokers to ensure availability in case of failures.
