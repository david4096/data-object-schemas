Roadmap
-------

The Data Object Service has been implemented in multiple workflow execution engines 
and has helped to allow cloud agnostic data access. A small network of DOS servers 
is available from a resolver at dataguids.org.

Software for presenting Human Cell Atlas, NCI GDC, GTEx, and TOPMed data are all made 
available. Making it easier to discover, interact with, access, and publish new data 
using supporting software, documentation, and possible schema changes make up the 
bulk of this roadmap.

## Goal

### Short term - 6 months

Release version 1 and improve ease of use and adoption through supporting software. 
Provide a model for cloud agnostic data management and a network of resolving services.

### Long term

Interoperate with most major scientific data providers to enable a decentralized 
network of Data Object Services.

## Metrics of success

What data are available by DOS?

How easy is it to publish new data using a Data Object Service?

What supporting software uses the Data Object Service?

## Milestones

### Stable schematization

* Bring the schemas repository to a stable state.
* Demonstrate usage of the schemas in clients and servers.
* Make the schematization easily available to other software.

### Lambda Interoperability Layer

* Create an interop layer for:
	* DSS
	* indexd
* Demonstrate authentication/authorization handling.

### Supporting software

* Create a DOS downloader that can handle resources in third party APIs.
* Demonstrate usage with Kafka/ES for DOS-connect.
* Create a "best practices" description of creating an HTTP-signing DOS endpoint.
* Demonstrate a DOS endpoint indexer, which will provide more flexible metadata queries.

### Workflows and Visualization

* Extend a workflow to use the DOS downloader (as opposed to a single URL).
* Create a basic workflow stage that can be reused to extend other workflows to use DOS downloader.
* Create a basic single page app  for viewing the contents of a DOS registry.

## Timeline

### December 2017

We are currently most of the way through *Stabilizing Schemas* and headed into *Lambda Interoperability Layer*.

### January 2017

We are deep into *Lambda Interoperability Layer* demonstrating working tests against real data served by GDC.

Some work towards demonstrating authentication will be offered for this lambda.

### February 2017

The lambda for signpost should have fleshed out all interop concerns. Work should focus on DSS lambda.

Some work has been shown on the DOS downloader.

Some software for syndication/replication is demonstrated (DOS-connect).

### March 2017

DOS lambdas are available for use for accessing data as a beta. Lambda deployment follows common SDLC practices (alpha, beta). Some metrics are added. 

Data in DOS endpoints has been indexed and made available for more complicated queries as a demonstration.

### April 2017

Practical authentication systems are combined with URL signing features in alpha.

A demonstration workflow uses DOS to download data.

### May 2017

The DOS downloader is extended to support other resources types. Published to PyPi.

Authentication schemes that require exchanging of third party API keys are demonstrated.

### June 2017

Publish a workflow stage that can be easily reused to access data using the DOS downloader.

Demonstrate API integration with metadata indexes to analyze "findability" of data.

### July 2017

Integration with a single page webapp allows for DOS manifests to be realized as files by the DOS downloader.

