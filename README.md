# How to
Starting from chipyard root
```
cd generators
git submodule add https://github.com/okBrian/chipyardTest.git
```
Compiling and Testing
```
~/chipyard> source env.sh
~/chipyard> cd sims/verilator
~/chipyard/sims/verilator> make launch-sbt
sbt:chipyardRoot> project not
sbt:not> compile        
sbt:not> test:compile             
sbt:not> testOnly // IDK HERE
```
