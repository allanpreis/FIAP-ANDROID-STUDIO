import React from 'react';
import {View, Text, TouchableOpacity, StyleSheet, TextInput} from 'react-native';


export default class Body extends React.Component {
    constructor (props){
        super(props);
        this.state = {
            text: '',
        }
    }
    botaoAdicionar = () => {
        const {text} = this.state;
        if (!text) return;
        this.props.onAdd(text);
        this.setState({text: ''});
    }

    render(){
        return(
            <View style={styles.container}>
                <Text style={styles.text}>Descrição: </Text>
                <TextInput
                    style={styles.input}
                    onChangeText={text => this.setState({text})}/>
                <Text style={styles.sizeText}/>
                <Text style={styles.text}>Quantidade: </Text>
                <TextInput
                    style={styles.input}
                    onChangeText={text => this.setState({text})}/>
                <Text style={styles.text}>Preço: </Text>
                <TextInput
                    style={styles.input}
                    onChangeText={text => this.setState({text})}/>
                <TouchableOpacity
                    style={styles.button}
                    onPress={this.botaoAdicionar}>
                    <Text style={styles.buttonText}>Adicionar Produto</Text>
                </TouchableOpacity>
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
    sizeText: {
        fontSize: 15,
    },
    input: {
        flex: 1,
        borderWidth: 1,
        borderColor: 'gray',
        fontSize: 15,
        paddingHorizontal: 'center',
        borderRadius: 3,
    },
    button: {
        backgroundColor: '#e91c5d',
        marginLeft: 10,
        flex: 1,
        textAlign: 'center',
    },
    buttonText: {
        color: 'white',
        textAlign: 'center',
        fontSize: 18,
    },
})