import React, { useState } from "react";
import { RectButton } from 'react-native-gesture-handler';
import {Text, View, StyleSheet, TextInput, TouchableOpacity} from "react-native";

export default function Body(props) {
    const [txt, setTxt] = useState(null)
    const [qtc, setQtc] = useState(null)
    const [prc, setPrc] = useState(null)
    function botaoAdicionar() {
        if (!txt || !qtc || !prc) {
            return
        }
        props.addProduct(txt, qtc, prc)
    }
        return(
            <View >
                <View style={styles.inputContainer}>
                    <View style={styles.inputContent}>
                        <Text style={styles.sizeText}>Descrição: </Text>
                        <TextInput
                            style={styles.input}
                            onChangeText={txt => setTxt(txt)}
                            defaultValue={txt}   />
                    </View>
                    <View style={styles.inputContent}>
                        <Text style={styles.sizeText}>Quantidade: </Text>
                        <TextInput
                            style={styles.input}
                            onChangeText={qtc => setQtc(qtc)}
                            defaultValue={qtc}  />
                    </View>
                    <View style={styles.inputContent}>
                        <Text style={styles.sizeText}>Preço: </Text>
                        <TextInput
                            style={styles.input}
                            onChangeText={prc => setPrc(prc)}
                            defaultValue={prc} />
                    </View>
                </View>
                <View style={styles.container}>
                    <RectButton
                        style={styles.button}
                        onPress={botaoAdicionar}>
                        <Text style={styles.buttonText}>Adicionar Produto</Text>
                    </RectButton>
                </View>
            </View>
        );
}

const styles = StyleSheet.create({
    inputContent: {
        flex: 1,
        width: '100%',
        justifyContent: 'flex-end',
        flexDirection: 'row',
        height: 100,
        marginBottom: 10,
    },

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
        height: 150,
        padding: 5,
        alignItems: 'stretch',
    },
    input: {
        height: 20,
        borderWidth: 1,
        borderColor: 'gray',
        fontSize: 15,
        width: '80%',
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
