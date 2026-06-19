# BRANCH [independent line of development ]


# BRANCHING STRATEGY [define rules and convention your team will follow ]
1. 3-BRANCH STRATEGY 



# REGRESSION TESTING 
a software testing process used to verify that recent code modifications, bug fixes, or 
system updates have not negatively impacted existing features or introduced unintended bugs 


# BRANCH 



MAIN B =======================>LONG LIVE
RELEASE B ====================>LONG LIVE
DEVELOPER B ==================>LONG LIVE
FEATURE B ====================>SHORT LIVE[1-2 DAY]

main -> release -> developer -> feature -> developer -> release [regression testing]-> production -> main 


# BRANCH COMMANDS 
1. git branch 
2. git branch name [creating a new branch]
3. git checkout name [ move to another branch]
4. git checkout -b name [ move to another and creating new branch] 
5. git branch -d name [delete a branch]




# HOTFIX BRANCH [QUICK FIX IN MAIN BRANCH AND MERGER BACK TO MAIN ]

# BACK MERGE[ MERGE RELEASE BRANCH TO MAIN BRANCH ]

