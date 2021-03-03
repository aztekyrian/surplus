# Database

A Database refers to any dataset in Delphix.  
A Database can be a source (dsource), staging or virtual (vdb or vfiles)

dxi provides commands to trigger some of the most commonly used database related operations

###Usage
Every dxi cli command has 4 sections as shown below

-   dxi : The main CLI
-   command : Indicates the Delphix object you will be working on. In this case,'environment'.
-   Operation : The operation that you are performing on the Delphix object
-   Options: Required and Optional parameters for the operation

```commandline 
   dxi database <operation> [options]
```

### Operations
Operations correspond to operations you can perform on the engine.   
The available actions on an database are

- link-oracle - Ingest an Oracle dsource
- link-mssql - Ingest a MS SQLServer dsource
- provision-mssql - Provision a MS SQLServer VDB
- provision-ase - Provision a Sybase VDB
- provision-oracle - Provision an Oracle VDB
- provision-appdata - Provision AppData (vFiles) dataset  
- updateHost - Updates the IP address on an existing environment
- refresh - Refreshes a virtual dataset
- rewind - Rewinds a virtual dataset
- start - Starts a virtual dataset
- stop - Stops a virtual dataset
- enable - Enables a virtual dataset
- disable - Disables a virtual dataset
- delete - Deletes a virtual dataset  
- list - Lists all datasets on an engine.

### Options

Options are additional parameters that you can pass to a dxi command in order to modify the behavior of the operation.
Some options are required, while others are not. The required options will be marked as [required] in the help information for an action.

!!! tip "Options"
     Detailed information on options coming soon. To view all options for an operation, run the following.
     ```bash
     dxi database <operation> --help
     ```

### Access Help Information
At every step, you can access the help information for a dxi command as follows

#### Access help info for the dxi environment command
```commandline 
   dxi database --help
```
#### Access help info for a specific dxi environment action
```commandline 
   dxi database <operation> --help
```