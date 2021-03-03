# Overview

Delphix Integrations is Delphix's response to address the lack of data agility that many organizations face today in their DevOps, ProdOps and AI/ML workflows. 
Many of these ecosystems have solved the automation of code and infrastructure but still face a data bottlenecks. 
Our focus is to simplify the integration of Delphix operations into these ecosystems and to plug-in the required data agility into these workflows that are frequently used by developers, testers, analysts and administrators.

dxi, the first release from Delphix Integrations project, is a CLI and a Python Library, designed to easily automate Delphix operations that are commonly used in workflows.
We recognize that despite being fully-featured, Delphix APIs were hard to use. 
Even a simple operation could require multiple nested configuration arguments that users were not necessarily aware of. 
dxi takes a simpler approach and minimizes the knowledge required to automate Delphix data virtualization operations.

We also recognize that some users prefer out of the box integrations with third party tools. 
In response, future iterations of Delphix Integrations will feature Delphix support within the most popular developer tools.


Python library (dxi library)
----------------

The dxi library is an interface for developing Python applications that connection & perform Virtualization and Self-Service operations across on a single or multiple Delphix Engines.

We chose Python because it's our customers’ language of choice when creating DevOps, ProdOps and AI/ML workflows due to its flexibility, extensibility and support.

Example Usage: 
``` python
    from dxi.database.dxi_refresh import DXIRefresh		
    
    ref = DXIRefresh()
    ref.refresh(name=“virtualdb1”)
```

Command line interface (dxi cli)
----------------

dxi cli is an interface for calling delphix operations from the command line. 
It is intended to work in different configurations and will soon be provided as a set of compiled executables for ease of use and compatibility.

Example Usage:
```bash
    dxi database refresh --name virtualdb1
```

Where to start
----------------
If you are not familiar with Delphix, we recommend you to start with our [Documentation](https://docs.delphix.com).

If you are already familiar with Delphix, but want to learn more about dxi, 
you can go to the [Getting started](/GettingStarted/index.html) section or jump to Sample Integrations for some hands-on examples.

Questions?
----------------
If you have questions, bugs or feature requests reach out to us via [email](dxi-support@delphix.com)