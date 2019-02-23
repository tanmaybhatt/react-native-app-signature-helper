
# react-native-app-signature-helper

## Getting started

`$ npm install react-native-app-signature-helper --save`

### Automatic installation

`$ react-native link react-native-app-signature-helper`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAppSignatureHelperPackage;` to the imports at the top of the file
  - Add `new RNAppSignatureHelperPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-app-signature-helper'
  	project(':react-native-app-signature-helper').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-app-signature-helper/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-app-signature-helper')
  	```


## Usage
```javascript
import RNAppSignatureHelper from 'react-native-app-signature-helper';

// TODO: What to do with the module?
RNAppSignatureHelper.getAppSignature().then(function(hashedAppSignature) {
	console.log(hashedAppSignature);
})
```
  