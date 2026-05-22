# VERSION CONTROL SYSTEM [is a software tool that records and tracks changes made to files over time.]

# DIFFERENCE BETWEEN GIT AND GITHUB
# GIT [is the website ]
# GITHUB [is the cloud platform ]


# GIT COMMAND 
1. git init
2. git status 
3. git log 
4. git add .
5. git commit -m "anything" [snapshot of code repository at that point in time ]
6. git push 

# BRANCH [independent line of development]
not to disturb our main branch


3-4 type of branch
main  branch--------------------------------------------->production /customer
staging branch------------------------------------------> pre-production
developers branch -----------------------------------------> for testing/QA
feature branch ------------------------------------------->

# COMMANDS
1. git branch
2. git branch name [crating new branch]
3. git checkout name [move to other branch]    git checkout -b name [to move and create in single step]
4. git branch -D name [delete the branch ]

# MERGE COMMANDS
1. [giving command from main] git merge staging
2. [giving command from staging] git merge testing


# GIT PULL
1. git pull [make change to git and apply git pull to bring change to local ]


# PULL REQUEST [PR]
ask our teammates to approve our code before it can be merged to staging/main
because in real time staging & main branch is locked


let create a pull request 
