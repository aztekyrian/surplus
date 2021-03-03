# Getting Started

dxi is a Python Library and CLI that is available for download from download.delphix.com and [PyPI](https://pypi.org/). 
Install dxi to your local environment or server(s) from where you would initiate the Delphix operations. 

dxi consists of two parts:

-   The dxi python library
-   The dxi command line interface (cli)

The dxi library exposes expose objects amd methods to easily initiate a Delphix operation programmatically.

The dxi cli exposes a command line interface to initiate the same Delphix operations from your terminal. 

Requirements
=============
-   macOS 10.15+, Windows 10
-   Python 3.7 or above (Python version < 3.6 are not supported)    
-   Delphix Engine 5.3.9 or above


Installing dxi
=============
!!! tip "Use a Virtual Environment"
    If you are using dxi library for development, we recommend that you do this inside a virtual environment.
    To learn more about virtual environments, refer to [Virtualenv's documentation](https://virtualenv.pypa.io/en/latest/).
    
    The virtual environment needs to use Python 3.7 or higher. 

### From download.delphix.com

1. Download the dxi.tar from download.delphix.com  
     
2. Copy dxi.tar to the directory where you want to install dxi
   
3. Unzip the contents. You should see a setup.py file in the extracted contents.  
    ```bash
        tar -xvf dxi.tar
    ```
4. Install dxi
    ```bash   
        pip3 install .     
    ```
### From PyPI

To install the latest version dxi 
```bash
    pip3 install dxi
```

### Test your installation
Run the following command to verify that your installation was successful

```bash
    dxi --help
```
You should see the dxi cli options as shown below
```commandline
        Usage: dxi [OPTIONS] COMMAND [ARGS]...
        
          This is the main CLI command
        
        Options:
          --version  Show the version and exit.
          --help     Show this message and exit.
        
        Commands:
          bookmark     Group command for Bookmark operations
          branch       Group command for branch operations
          container    Creates, Lists, Removes a Self-Service Data Pod
          database     database is a group command perform dsource or vdb operations
          environment  Group command for environment operations
          snapshot     To Add and Delete snapshots
          template     Command for all Self Service Template related operations
```

Configuring dxi
===============================
Great! You have installed the dxi cli and library successfully.  
Let us now configure dxi to connect with your Delphix Engines. 

###Configuration File
By default, dxi reads your Delphix engine configuration from a json file named dxtools.conf. 
This file will be located at the following path under your python site-packages directory
```xpath
    <your_python_install_dir>/site-packages/dxi/config/dxtools.conf
```
#### Config File Structure

```json
    {
      "name": [
        {
          "ip_address": "2.222.222.222",
          "username": "username",
          "password": "password",
          "use_https": "False",
          "default": "False",
          "hostname": "engine_host_name_1"
        }
      ],
      "name": [
        {
          "ip_address": "1.111.22.111",
          "username": "admin",
          "password": "delphix",
          "use_https": "True",
          "default": "True",
          "hostname": "engine_host_name_2"
        }
      ]  
    }

```
### Description of Fields
- name - Friendly name used to identify a Delphix Engine. This is the identifier dxi uses for an engine.
- ip_address - Delphix Engine IP address or hostname
- username - Delphix username
- password - Delphix username password
- port - Port number to communicate with the engine - 80 | 443
- default - Is this Delphix Engine, a default one - true | false
- use_https - What protocol will be used for communication - true | false
- hostname - This can be same as the name field. This value is used for debug logging.

#### Providing your own config file
You can provide your own config file for dxi as shown below. 
Please ensure that the json format of the provided file conforms to the sample show above.

dxi cli:

```commandline
    dxi database refresh --config /full/path/with/configfile/name
```

dxi library:

```python
    ref = DXIRefresh(config="/full/path/with/configfile/name")
```

###Great!
You have set up and configured dxi on your environment.    

For information on how to use dxi as a CLI, refer to CLI References section under References
For information on how to use dxi as a Library, refer to Library References section under References