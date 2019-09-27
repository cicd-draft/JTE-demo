### Q1: 报错如下

```sh
java.lang.NoSuchMethodError: No such DSL method 'cleanWs' found among steps [archive, bat, build, catchError, checkout, 
deleteDir, dir, dockerFingerprintFrom, dockerFingerprintRun, echo, envVarsForTool, error, fileExists, getContext, git, input, 
isUnix, junit, library, libraryResource, load, lock, mail, milestone, node, parallel, powershell, properties, pwd, readFile, 
readTrusted, resolveScm, retry, script, sh, sleep, stage, stash, step, timeout, timestamps, tm, tool, unarchive, unstable, 
unstash, validateDeclarativePipeline, waitUntil, warnError, withContext, withCredentials, withDockerContainer, 
withDockerRegistry, withDockerServer, withEnv, wrap, writeFile, ws] or symbols [all, allOf, always, any, anyOf, apiToken, 
architecture, archiveArtifacts, artifactManager, batchFile, booleanParam, branch, ...
```

**原因**
- 这是由于没有添加*对应的*插件，在Jenkins中添加插件：

**解决方法**
- 安装插件 **Workspace Cleanup**



