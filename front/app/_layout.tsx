import { Stack } from 'expo-router/stack';
import 'react-native-reanimated'; // fixes issue with crashed expo app on tab switch https://github.com/expo/expo/issues/28618

const Layout = () => {
  return (
    <Stack>
      <Stack.Screen name='(tabs)' options={{ headerShown: false }} />
    </Stack>
  );
};

export default Layout;
