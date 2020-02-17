package com.example.player_2.poem


class writer {
    object poem {
        fun write_poem(): String {  //隨機生成詩句
            var poem = ""
            var counter = 0
            while (counter < 24) {
                val ran = Math.floor(Math.random() * 500).toInt()   //對，隨機          500是指前500個常用漢字
                val tx = data.dict.word[ran]    //翻字典
                poem += tx
                counter += 1

                when (counter) {
                    5 -> {
                        poem += "，"
                        counter += 1
                    }
                    11 -> {
                        poem += "。"
                        counter += 1
                    }
                    17 -> {
                        poem += "，"
                        counter += 1
                    }
                    23 -> {
                        poem += "。"
                        counter += 1
                    }
                }
            }

            return poem

        }

        fun design_write_poem(inp_heads: String): String {  //生成藏頭詩
            var poem = ""
            var counter = 0
            var heads = inp_heads
            if(heads.length < 4){   //把藏頭句子不足的字數補上
                for(i in heads.length..4){
                    val ran = Math.floor(Math.random() * 500).toInt()       //前500個常用漢字
                    val tx = data.dict.word[ran]
                    heads += tx
                }
            }
            while (counter < 24) {
                val ran = Math.floor(Math.random() * 500).toInt()   //剩下的都是隨機
                val tx = data.dict.word[ran]
                when (counter) {
                    0 -> {
                        poem += heads[0]
                        counter += 1
                    }
                    6 -> {
                        poem += heads[1]
                        counter += 1
                    }
                    12 -> {
                        poem += heads[2]
                        counter += 1
                    }
                    18 -> {
                        poem += heads[3]
                        counter += 1
                    }
                }
                poem += tx
                counter += 1

                when (counter) {
                    5 -> {
                        poem += "，"
                        counter += 1
                    }
                    11 -> {
                        poem += "。"
                        counter += 1
                    }
                    17 -> {
                        poem += "，"
                        counter += 1
                    }
                    23 -> {
                        poem += "。"
                        counter += 1
                    }
                }
            }

            return poem

        }
    }
}