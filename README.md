# JavaPractApr2024

10-Apr-2024 - Started working today


Refer video for this file - src/main/java/com/test/main/OracleDBConnection.java
Install Docker Desktop first - https://www.docker.com/products/docker-desktop/
    link - https://www.youtube.com/watch?v=0D8hf2Fj_jo
    Oracle download - https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html
Oracle docker image from git:
    https://github.com/oracle/docker-images.git


Commands to run - 
./buildContainerImage.sh -v 19.3.0
docker run -d --name oracle19 -e ORACLE_PWD=mypassword -p 1521:1521 oracle/database:19.3.0-ee
Once Docker has the Oracle image up and running, [status should be healthy and image should be started] then:
configure the SQL connection from VSCode's add on SQL Developer.