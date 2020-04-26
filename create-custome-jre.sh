rm -rf output/
jlink --output output --add-modules $(jdeps --print-module-deps target/base-swing-fx-boot-0.0.1-SNAPSHOT.jar),java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument,java.scripting
cp target/base-swing-fx-boot-0.0.1-SNAPSHOT.jar output/output.jar
cp runner.sh output/runner.sh
cp runner.bat output/runner.bat