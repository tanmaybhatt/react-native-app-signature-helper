
import { NativeModules } from 'react-native';

const { RNAppSignatureHelper } = NativeModules;

export default {
    getAppSignature: RNAppSignatureHelper.getAppSignatures,
    getAppSignatures: RNAppSignatureHelper.getAppSignatures
};
