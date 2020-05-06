cd ../target
nohup java -jar basic-0.0.1-SNAPSHOT.jar --spring.profiles.active=online > ../log/app.log &
tail -100f ../log/app.log