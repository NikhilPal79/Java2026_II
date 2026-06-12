# Jenkins [it is open source automation server used to implement CI/CD pipelines ]

# Flow of jenkins ci/cd
0. select the freestyle project 
1. copy code from git repo 
2. select which branch you want to automate 
3. in trigger [Build periodically][select crone job ] [automated way to push code]
4. Poll SCM [untriggers the cron scheduler, activate Scm which only pulls recents code when you do change ins src code ][manual code]

# CRONE JOBS [Time Scheduler ]