import React from "react";
import {Text, View, StyleSheet, TextInput, TouchableOpacity} from "react-native";

export default class Body extends React.Component {
    constructor (props){
        super(props);
        this.state = {
            text: '',
            qtd: '',
            prc: '',
        }
    }
    botaoAdicionar = () => {
        const {text, qtd, prc} = this.state;
        if (!text) return;
        this.props.onAdd(text);
        this.setState({text: ''});
        if (!qtc) return;
        this.props.onAdd(qtc);
        this.setState({qtc: ''});
        if (!prc) return;
        this.props.onAdd(prc);
        this.setState({prc: ''});
    }
    render(){
        return(
            <View >
                <View style={styles.inputContainer}>
                    <Text style={styles.sizeText}>Descrição: </Text>
                    <TextInput
                        style={styles.input}
                        onChangeText={text => this.setState({text})}   />
                    <Text style={styles.sizeText}>Quantidade: </Text>
                    <TextInput
                        style={styles.input}
                        onChangeText={qtd => this.setState({qtd})}   />
                    <Text style={styles.sizeText}>Preço: </Text>
                    <TextInput
                        style={styles.input}
                        onChangeText={prc => this.setState({prc})}   />
                </View>
                <View style={styles.container}>
                    <TouchableOpacity
                        style={styles.button}
                        onPress={this.botaoAdicionar}>
                        <Text style={styles.buttonText}>Adicionar Produto</Text>
                    </TouchableOpacity>
                </View>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    centeredView: {
        flex: 1,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center',
    },
    modalView: {
        flex: 1,
        margin: 20,
        padding: 10,
        elevation: 5,
    },
    sizeText: {
        fontSize: 15,
    },
    inputContainer: {
        display: 'flex',
        padding: 5,
        alignItems: 'stretch',
    },
    input: {
        borderWidth: 1,
        flexDirection: 'column',
        borderColor: 'gray',
        fontSize: 15,
        width: 200,
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
    container: {
        flexDirection: 'row',
        backgroundColor: '#e91c5d',
        height: 40,
        alignItems: 'center',
    },
});
