# dproz-arche-type

To create a dproz microservice perform the following steps:

1. Clone this repo:
		git clone  https://github.com/Dproz/dproz-arche-type.git
	
2.  Go to dproz-arche-type and run the following
mvn install

3. Got a Directory where new service needs to created and run the following command:

  mvn archetype:generate -DarchetypeCatalog=local

4. Select the archetype installed in Step 2

	example it looks like below
```
3: local -> com.ceitechs.dproz:dproz-archetype (Dropz microservice arche type)
```

5. Enter Some groupId and artifactId as this is not the final, enter "N" when it asks for the "Confirm properties configuration"

	```
		  Define value for property 'groupId': s
		  Define value for property 'artifactId': s
		  Define value for property 'version' 1.0-SNAPSHOT: : s
		  Define value for property 'package' s: : s
		  [INFO] Using property: service-description = Dropz microservice arche type
		  [INFO] Using property: service-name-as-in-package = sampleapp
		  Confirm properties configuration:
		  groupId: s
		  artifactId: s
		  version: s
		  package: s
		  service-description: Dropz microservice arche type
		  service-name-as-in-package: sampleapp
		  Y: : N
	```  
6. Now enter appropriate groupId and artificatId , also ```service-description``` and ```service-name-as-in-package```


	```
		Define value for property 'groupId': com.ceitechs.dproz
		Define value for property 'artifactId': user-management
		Define value for property 'version' 1.0-SNAPSHOT: : 
		Define value for property 'package' com.ceitechs.dproz: : 
		Define value for property 'service-description' Dropz microservice arche type: : Service which manages users 		     	in dproz
		Define value for property 'service-name-as-in-package' sampleapp: : usermanagement
		Confirm properties configuration:
		groupId: com.ceitechs.dproz
		artifactId: user-management
		version: 1.0-SNAPSHOT
		package: com.ceitechs.dproz
		service-description: Service which manages users in dproz
		service-name-as-in-package: usermanagement
	```

7. Project is ready , you can run below command to build and create the first docker image.
	
	``` ./mvnw install 
	```

curl -X POST \
  http://localhost:8080/api/dproz/user \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json;charset=UTF-8' \
  -H 'postman-token: e36ae39a-79b9-d678-e2fe-8d57a1453ca0' \
  -d '{
	"name" : "prabhakar",
	"password" : "password"
}'
