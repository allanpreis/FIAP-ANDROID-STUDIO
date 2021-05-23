import React from "react";
import {Text, View, StyleSheet} from "react-native";

export default class Header extends React.Component {
    render(){
        return(
            <View style={styles.container}>
                <Text style={styles.text}>Comanda Eletrônica</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flexDirection: 'row',
        backgroundColor: '#e91c5d',
        height: 40,
        alignItems: 'center',
    },
    text:{
        flex: 1,
        textAlign: 'center',
        fontSize: 20,
        color: 'white',
    },
})