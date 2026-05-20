# BRANCH
not to disturb our main branch


3-4 type of branch
main  branch--------------------------------------------->production /customer
staging branch------------------------------------------> pre-production
feature branch ------------------------------------------->
developers branch -----------------------------------------> for testing/QA

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
