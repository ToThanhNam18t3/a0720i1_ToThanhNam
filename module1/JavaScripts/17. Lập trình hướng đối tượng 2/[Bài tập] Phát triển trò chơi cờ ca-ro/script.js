        class Caro {
            constructor(player1, player2, width, height) {
                this.player1 = player1;
                this.player2 = player2;
                this.width = width;
                this.height = height;
                this.arrayOfCaro = new Array(height);
                this.isCheckPerson1 = true;
            }
            init() {
                for (let i = 0; i < this.width; i++) {
                    this.arrayOfCaro[i] = new Array();
                    for (let j = 0; j < this.height; j++) {
                        this.arrayOfCaro[i][j] = ""
                    }
                }
            }
            displayCaro() {
                let temp = "<table border=1 cellpadding = 20> ";
                for (let i = 0; i < this.width; i++) {
                    temp += "<tr>"
                    for (let j = 0; j < this.height; j++) {
                        temp += "<td onclick ='changeCaro(" + i + "," + j + ")'>" + this.arrayOfCaro[i][j] + "</td>"
                    }
                    temp += "</tr>"
                }
                temp += "</table>"
                document.write(temp);
            }
            changeCaro(x, y) {
                if (this.arrayOfCaro[x][y] == "X" || this.arrayOfCaro[x][y] == "O") {
                    alert("Ô bạn chọn đã có người khác chọn")
                } else {
                    if (this.isCheckPerson1) {
                        this.arrayOfCaro[x][y] = "X";
                        this.checkWinner("X");
                        this.isCheckPerson1 = false;
                    } else {
                        this.arrayOfCaro[x][y] = "O";
                        this.checkWinner("O");
                        this.isCheckPerson1 = true;
                    }
​
                    document.body.innerHTML = "";
                    this.displayCaro();
​
                }
            }
            checkWinner(temp) {
                for (let i = 0; i < this.height; i++) {
                    for (let j = 0; j < this.width -2; j++) {
                        if (this.arrayOfCaro[i][j] == temp && this.arrayOfCaro[i][j + 1] == temp && this.arrayOfCaro[i][j + 2] == temp) {
                           if(temp =="O") {
                               alert(this.player1 +" win")
                           } else {
                            alert(this.player2 +" win")
                           }
                            this.init();
                            this.displayCaro();
                        }
                    }
                }
                for (let i = 0; i < 3; i++) {
                    for (let j = 0; j < 5; j++) {
                        if (arrayOfCaro[i][j] == temp && arrayOfCaro[i + 1][j] == temp && arrayOfCaro[i + 2][j] == temp) {
                            alert(temp + " win")
                            init();
                            displayCaro();
                        }
                    }
                    for (let j = 0; j < 3; j++) {
                        if (arrayOfCaro[i][j] == temp && arrayOfCaro[i + 1][j + 1] == temp && arrayOfCaro[i + 2][j + 2] == temp) {
                            alert(temp + " win")
                            init();
                            displayCaro();
                        }
                    }
                    for (let j = 2; j < 5; j++) {
                        if (arrayOfCaro[i][j] == temp && arrayOfCaro[i + 1][j - 1] == temp && arrayOfCaro[i + 2][j - 2] == temp) {
                            alert(temp + " win")
                            init();
                            displayCaro();
                        }
                    }
                }
            }
        }
        let caro = new Caro("Hai", "A07", 10, 10);
        caro.init();
        caro.displayCaro();
        function changeCaro(i, j) {
            caro.changeCaro(i, j);
        }