# REST
## What is REST?
In 2000, Roy Fielding, one of the principal authors of the HTTP specification, 
proposed an architectural approach for designing web-services known as 
Representational State Transfer (REST).
Note that, while this article assumes REST implementation with HTTP protocol, 
REST is not tied to HTTP. REST API’s are implemented for a “resource” 
which could be an entity or service. These API’s provide way to identify a 
resource by its URI, which can be used to transfer a representation of a 
resource’s current state over HTTP.

## Rest conventions

* Use Nouns in URI

    REST API’s should be designed for Resources, which can be entities or services, etc., therefore they must always be nouns. For example, instead of /createUser use /users
* Plurals or Singulars        
    
    Generally, we prefer to use plurals but there is no hard rule that one can’t use singular for resource name. The ideology behind using plurals is:
    We are operating on one resource from collection of resources so to depict collection we use plural
* Let the HTTP Verb Define Action
    ![HTTP Verb](methods.png)
* Version Your APIs
    Versioning APIs always helps to ensure backward compatibility of a service while adding new features or updating existing functionality for new clients. 
    