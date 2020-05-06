cd ../
mvn clean package -Dmaven.test.skip=true

rm -rf logs
mkdir logs