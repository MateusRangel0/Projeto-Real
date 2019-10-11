
# Release instructions

## Preparation

* Increase version numbers in the poms below samples/ (they are not automatically updated)

```
cd samples
mvn versions:set -DgenerateBackupPoms=false -DnewVersion=0.15.4
```

* Run "update_issue_links.sh" in "doc/"
* Check into Git, push, create PR and apply

## Building and deploying

* Run the build over the fabric8 CD Pipeline 

or in the _classic_ way:

```
mvn -Dmaven.repo.local=/tmp/clean-repo -DdevelopmentVersion=0.23-SNAPSHOT -DreleaseVersion=0.23.0 -Dtag=v0.23.0 -Prelease release:prepare
mvn -Dmaven.repo.local=/tmp/clean-repo -DdevelopmentVersion=0.23-SNAPSHOT -DreleaseVersion=0.23.0 -Dtag=v0.23.0 -Prelease release:perform
```

and then push to Maven central manually via https://oss.sonatype.org/

## Update from upstream

```
git co master
git pull upstream master
git rebase upstream/master
```

## After the build

* Set sample version back to the snapshot version

```
mvn versions:set -DgenerateBackupPoms=false -DnewVersion=0.15-SNAPSHOT
```

* Check-In and create PR

## Update documentation

* Update branch `dmp.fabric8.io` with the exact version of the plugin build and push it to upstream (https://github.com/fabric8io/docker-maven-plugin)

```
git fetch -u upstream --tags
git co dmp.fabric8.io
git merge v0.19.0
git push -u upstream dmp.fabric8.io
```

* The docs will be then build by `circleci.com`
