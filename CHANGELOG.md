# 0.2.2
Ability to re-generate secrets from .properties file into a Java class
# 0.2.1
### Fixes
* Convert key names to C++ style to avoid `No implementation found` error
#### Contributors
@pratclot
# 0.2.0
### Improvements
* Ability to re-generate secrets from .properties file
* Group Gradle tasks and their descriptions to convenience command `tasks`
* Add a blank space after all // in line comments
#### Contributors
@valydia
@marius-m
@michpohl
# 0.1.5
### Fixes
* Fix `UnsatisfiedLinkError` when package name has underscores. Reported in https://github.com/klaxit/hidden-secrets-gradle-plugin/issues/52
* Add unit tests for package name conversion
### Improvements
* Update libs and gradle
# 0.1.4
### Improvements
* Update libs and gradle
# 0.1.3
### Fixes
* Fix build on Mac with M1 chip
### Improvements
* Update Gradle, Detekt, and Kotest
# 0.1.2
### Fixes
* Fix call to `customDecode()` in C++ code
### Improvements
* jcenter dependency removed
* Moving up to gradle 6.8.3
* Various libraries update
# 0.1.1
### Fixes
* Fix sha256 generation : long keys are now decoded correctly. Reported in https://github.com/klaxit/hidden-secrets-gradle-plugin/issues/16
* Random string generation was not including lower case characters
### Improvements
* The plugin search for `Secrets.kt` to add other keys instead of using package's name to access it.
* Resolve package from the Kotlin file to edit the C++ file to be able to use a different package than the package of Secret.kt to encode/decode keys.
* Clearer error message for `hideSecret` command
* Clearer logs
* Tasks name become public
* Use more constants in code to avoid regression
* Automatic tests added
* Detekt added to the project to ensure Kotlin coding style
### Migration from 0.1.0
* To take advantage of the sha256 generation fix you need to :
1) Remove files : `secrets.cpp`, `sha256.cpp` and `Secrets.kt` from your project (that will delete all your keys previously added)
2) You need to re-add all your keys with `hideSecret` command (will copy new cpp files and encode your key)
# 0.1.0
* First release