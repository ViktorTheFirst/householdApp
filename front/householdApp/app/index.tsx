import React from 'react';
import { Dimensions, StyleSheet, Text, View } from 'react-native';

const windowWidth = Dimensions.get('window').width;
const windowHeight = Dimensions.get('window').height;

const App = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.red}>HOUSEHOLD APP HOME PAGE</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'pink',
    flex: 1,
    width: windowWidth,
    height: windowHeight,
  },

  red: {
    margin: 'auto',
    color: 'red',
  },
});

export default App;
