package commands

import net.dv8tion.jda.api.events.message.MessageReceivedEvent

private val regrasMessage = """
🦇 **Regras Resumidas do Jogo (V5)**

**Teste de Dados (role):**
- Role um número de d10 igual ao Atributo + Perícia.
- Substitua dados normais por dados de Fome igual ao seu nível de Fome.
- Cada 6+ conta como sucesso.
- Dois ou mais 10 formam um Crítico (Crítico Sujo se houver 10 em dado de Fome).
- Falha Bestial ocorre se houver 1 em dado de Fome e nenhum sucesso.

---

**Crítico Sujo e Falha Bestial:**
- Crítico Sujo: se consegue o que se tentava, mas com consequências ruins, onde A Besta aparece mais do que deveria dependendo da situação.
- Falha Bestial: A Besta toma conta e atraplha catastroficamente o que se queria fazer. Dependendo da situação, pode:
-- Pode perder um ponto de vantagem relevante.
-- Dano agravado, tanto físico quanto mental.
-- Sua Fome aumenta em +1.
-- Alguma compulsão relevante

---

**Teste de Fome:**
- Role 1d10 para ativar poderes, curar dano ou despertar.
- Se tirar 5 ou menos, aumente Fome em +1.
- Muitas habilidades exigem Teste de Fome.

---

**Fome:**
- Fome vai de 0 a 5.
- Fome 5 impede o vampiro de agir com calma: qualquer provocação pode gerar Frenesi.
- Fome só volta a 0 drenando completamente uma vítima ou por efeitos raros.

---

**Compulsão:**
- Ocorre após uma Falha Bestial ou situação relevante, como exposição à um perigo mortal ou um querido em perigo.
- Pode ser de Fome, Violência, Paranóia ou uma Compulsão do Clã.
- Enquanto durar, você deve agir conforme a compulsão; penalidade de -2 dados em ações não alinhadas.

---

**Frenesi**
- Teste = Força de Vontade + 1/3 da sua Humanidade (arredondado para baixo).
- Se falhar, você perde o controle e age conforme o impulso.
- Pode gastar Força de Vontade para ignorar o Frenesi por 1 turno.
- Em Frenesi você só pode usar Disciplinas físicas e ignora penalidades de dor.

---

**Humanidade:**
- Representa o quanto você ainda é ligado ao humano dentro de si.
- Ações monstruosas geram Manchas.
- Ao fim da cena, teste Remorso se tiver Manchas: falhar = perder Humanidade.
- Pouca Humanidade prejudica interações sociais e torna sua presença cada vez menos humana.

---

**Ressonância:**
- Cada vítima possui um “sabor emocional”: Colérica, Melancólica, Flegmática, Sanguínea, Vazia ou Animal.
- Ressonâncias intensas dão bônus em Disciplinas associadas.
- Ressonância Aguda pode causar Discrasia — efeitos especiais após beber aquele sangue.

---

**Criação de Personagem:**
- Distribua pontos em Atributos e Perícias.
- Escolha Clã, conceito, ambição, relacionamento com seu Sire e vínculos pessoais.
- Determine Humanidade, Força de Vontade e antecedentes.
- Escolha Disciplinas iniciais.
- Selecione Tipo de Predador — define estilo de caça e modifica ficha.
- Adquira Méritos e Falhas que afetam capacidades sociais, físicas, sobrenaturais ou de história.

---

**Tipos de Predador:**
- Define como você se alimenta e seu comportamento predatório.
- Exemplos: Alleycat (violento), Sandman (adormecidos), Farmer (animal), Siren (sedução), Consensualista (apenas voluntários).
- Concede bônus, penalidades e ajustes permanentes na ficha.

---

**Disciplinas:**
- Poderes vampíricos ativados com Teste de Fome em muitos casos.
- Testes combinam um Atributo + a Disciplina.
- Alguns poderes aumentam risco de Crítico Sujo.
- Disciplinas de cada Clã definem seu estilo de jogo.

---

**Méritos e Falhas:**
- Representam vantagens e limitações do personagem.
- Méritos podem conceder aliados, recursos, sentidos ampliados, capacidade de combate ou influência.
- Falhas podem impor fraquezas sociais, físicas ou sobrenaturais.
- Devem ser interpretadas e impactam rolagens e decisões.

---

**Dano e Cura:**
- Vampiros recebem dano Superficial ou Agravado.
- Superficial: marcado com “/”. Cura com Testes de Fome.
- Agravado: marcado com “X”. Exige três Testes de Fome e uma noite de descanso.
- Se todo o marcador de Saúde encher com agravado, o vampiro entra em Torpor.
- Realiza um teste de Fome por ponto de dano superficial curado.
- Ao amanhecer, realiza 3 testes de Fome para curar um ponto de dano agravado.

---

**Dano Mental:**
- Funciona como dano físico, mas o dano é marcado na Força de Vontade.
- Gastar Determinação para rerrolar dados causa dano mental superficial.
- No começo de cada sessão, cura um número de dano superficial igual a Autocontrole ou Determinação.
- No começo de cada sessão, cure um ponto caso tenha agido conforme sua ambição.

---

**Ordem de Combate:**
- Todos dizem o que irão fazer, é determinada as rolagens necessárias, e tudo ocorre ao mesmo tempo.
- Iniciativa (Opcional): rolagem baseada na situação (física, social ou percepção).
- Cada turno permite 1 ação principal e ações menores.

---

**Ataques e Ações Físicas:**
- Corpo a corpo: Força ou Destreza + Briga/Armas.
- Armas de fogo: Compostura ou Determinação + Armas de Fogo.
- Ataques surpresa, defesa total e manobras modificam os testes.

---

**Impedimentos e Efeitos Ambientais:**
- Fogo sempre causa dano Agravado.
- Sol causa dano Agravado por turno.
- Estaqueamento causa Torpor, mas exige uma rolada de ataque com -5.
- Mutilações graves podem impor penalidades permanentes até cura.
"""
.trimIndent()

class regrasCommand {
    fun execute(event: MessageReceivedEvent) {
        event.channel.sendMessage(regrasMessage).queue()
    }
}
