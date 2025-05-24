/**
 * @param {string[]} words
 * @param {character} x
 * @return {number[]}
 */
function contains(str, char){
    for (let i = 0; i < str.length; i++){
        if(str[i] == char){
            return true;
        }
    }
    return false;
}

var findWordsContaining = function(words, x) {
    let arr = [];
    for (let i = 0; i<words.length; i++){
        if(contains(words[i], x)){
            arr.push(i);
        }
    }
    return arr;
};