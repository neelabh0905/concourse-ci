# Spring boot project configured for concourse pipeline (build and dockerize on concourse).

**************************************BEGIN***************************************

Go to ci folder in project, open pipeline.yml in any IDE.

Update the fields, like github repo path, docker hub repo path,username and password
Once done then follow the below steps

=> Go to ci folder in project, open terminal and execute `docker-compose up`.

=> Once docker is up and images are pulled and running (concourse and postgres). Install Fly CLI.

Open http://localhost:8080 ,i.e. concourse

1) In terminal execute `fly -t ps login -c http://localhost:8080` where t is target, ps is name, -c is where concourse is running.
2) When asked for token, go to given concourse url (in terminal) and login with username/password as "test".
3) To check login status, execute fly -t ps status
4) At last execute `fly -t ps set-pipeline -c pipeline.yml -p pipeline`. This will configure your build.

On either committing the code in git repo or refreshing the concourse pipeline, build will auto-trigger.


**************************************END***************************************

