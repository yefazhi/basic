cd ../target
nohup java -jar basic-0.0.1-SNAPSHOT.jar --spring.profiles.active=online > ../logs/app.log &
tail -100f ../logs/app.log