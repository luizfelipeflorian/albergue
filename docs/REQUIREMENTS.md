# Documento de Requisitos do Projeto

# Introdução

## Problema

Segundo o [Dicionário Michaelis](https://michaelis.uol.com.br/moderno-portugues/busca/portugues-brasileiro/albergue) albergue pode ser considerado:
1. Lugar onde se abrigam pessoas;
2. Lugar de hospedagem; estau, hospedaria, pousada;
3. Lugar que recolhe pessoas por caridade; asilo, hospício;
4. Lugar para onde se vai para fugir a um perigo; refúgio, resguardo.

Esse modelo de hospedagem representa uma das formas de acolhimento adotadas pelo Sistema Único de Assistência Social para 
materializar a conquista de direitos por parte dos cidadãos em situação de rua.

O Algerbue é uma ferramenta cuja finalidade é abrigar pessoas em situações de rua de forma personalizada e qualificada de 
"modo a promover a saída das ruas com dignidade e respeito à sua vontade e nível de autonomia" [VITÓRIO, 2012, p. 20](https://lume.ufrgs.br/bitstream/handle/10183/66983/000871703.pdf?sequence=1&isAllowed=y).

Os albergues podem ser mantidos pelos órgãos de governo municipal por meio de políticas públicas e da 
[Orientação aos Municípios sobre Regulamentação da Política Municipal de Assistência Social](https://www.mds.gov.br/webarquivos/publicacao/assistencia_social/cartilhas/cartilha_orientacao_aosMunicipios.pdf) 
e em conformidade com o [Sistema Único de Assistência Social (SUAS)](https://www.gov.br/mds/pt-br/acoes-e-programas/suas) 
ou por entidades filantrópicas sem fins lucractivos.

A cidade de Naviraí, em Mato Grosso do Sul, possui um albergue mantido por uma organização sem fins lucrativos e 
que é mantida por um grupo de patrociandores privados e por recursos de manutenção fornecidos pela prefeitura municipal.

Esse albergue tem um fluxo alto de rotatividade de pessoas nas quais usam o espaço de forma temporária, seja para 
atender necessidades de tratamento médico temporário, seja para aguardar a autonomia financeira de uma pessoa, ou 
apenas para atender pessoas em situação de rua.

Para manter o orçamento do local em ordem, o albergue faz um controle diário das pessoas que usam o espaço para 
descanso temporário. Cada diária é composta por três alimentações (café, almoço e janta). O controle de lotação do 
espaço é essencial para a manutenção predial e para o controle dos gastos relacionados a alimentação dos hóspedes. 
A diária não é cobrada do hospede, mas ele deve apresentar justificativas que sustentem a necessidade de mais de uma 
pernoite no local.

## Objetivo Geral

Desenvolver uma solução de software personalizada que atenda as necessidades de controle de lotação de quartos disponíveis e da alimentação fornecida gratuitamente aos hospedes do albergue.

## Objetivos específicos

1. Ter uma gestão e acompanhamento das pessoas em situação de rua que usufruem do albergue;
2. Ter uma gestão da capacidade de lotação do albergue com regras de permanência temporária;
3. Ter uma gestão da alimentação gratuita oferecida aos hóspedes

# Requisitos do sistema

## Requisitos do usuário
1. Controle de lotação do albergue;
2. Controle de refeições cedidas por pessoas - Sempre será 3 refeições por pessoa;
3. Relatórios de controle para apresentar aos patrocinadores do albergue;
4. O sistema deve ter um controle de acesso para cada pessoa do administrativo do albergue.

## Requisitos funcionais

### Requisitos de controle de acesso ao sistema
1. O sistema deve disponibilizar uma tela de autenticação. Essa tela de autenticação deve exigir um nome de usuário e uma senha para permitir o acesso ao sistema.
2. O sistema deve disponibilizar uma forma do usuário recuperar a sua senha caso tenha esquecido ela.
3. O sistema deve disponibilizar a manutenção de usuários do sistema. Um usuário é determinado pelos seguintes dados:
    1. Nome do usuário: um texto que identifica unicamente o usuário dentre os demais. Este é o nome usado para autenticar no sistema.
    2. E-mail. Um texto que identifica o e-mail de contato do usuário. Serve também para estabelecer uma forma de recuperação de senha.
    3. Número do celular: Um texto que identifica o número de contato de celular do usuário. Serve também para estabelecer uma forma de recuperação de senha.
    4. Perfil: este campo determina o perfil de acesso do usuário. Pode ser: Administrador do sistema, gerente, recepcionista, assistente.

### Requisitos para acompanhamento de pessoas que usufruem do albergue
1. O sistema deve disponibilizar a manutenção dos dados dos hóspedes que usarão o espaço para descanso e alimentação. Para identificação dos hóspedes é necessário que os seguintes dados sejam informados:
    1. Número de identificação única
    2. Nome completo
    3. Número do documento. CPF no caso de hóspede brasileiro e PASSAPORTE para os estrangeiros. Avaliar os casos em que o hóspede não tenha documentos.
    4. Data de nascimento
    5. Escolaridade
2. O sistema deve disponibilizar a manutenção de motivos que ajudem a identificar o histórico de uso do albergue pelas pessoas. Um motivo é determinado pelos seguintes dados:
    1. Identificador do motivo. Um número inteiro que identifica unicamente o motivo de permanência da pessoa.
    2. Nome do motivo. Uma descrição simples que ajude a identificar o motivo.
    3. Descrição do motivo. Descrição detalhamento do motivo utilizado pela pessoa para usar o albergue.
    4. Regra de permanência. Define a quantidade de diárias necessárias para que o motivo apresentado pela pessoa possa ser atendido.
    5. Status: Texto que identifica o estado atual do motivo. Pode ser: ATIVO ou INATIVO.
4. O sistema deve disponibilizar a manutenção de regras de permanência no albergue na qual delimita o número de diárias de acordo com os motivos apresentados pelas pessoas. Uma regra é determinada pelos seguintes dados:
    1. Identificador da regra. Um número inteiro que identifica unicamente a regra de permanência no albergue.
    2. Nome da regra
    3. Diárias: Um número inteiro que determina o número de diárias que o hóspede pode permanecer no albergue
    4. Status: Texto que identifica o estado atual da regra. Pode ser: ATIVO ou INATIVO.

### Requisitos pra o controle de lotação do albergue
1. O sistema deve disponibilizar a manutenção de quartos existentes no albergue. Um quarto é determinado pelos seguintes dados:
    1. Identificador do quarto. Um número inteiro que identifica unicamento o quarto.
    2. Nome do quarto. Um texto padronizado de identificação do quarto o qual possa identificar a sua localização.
    3. Camas: um número inteiro que determina a quantidade de camas existentes no quarto.
    4. Status: Texto que identifica o estado atual do quarto. Pode ser: ATIVO, MANUTENÇÃO ou INATIVO.
3. O sistema deve permitir o registro de entrada de um hóspede alocando um quarto/cama por um período determinado. A alocação de um quarto para um hóspede é chamada de CHECKIN. Os dados necessários para a alocação o espaço no albergue são:
    1. Data e hora da alocação
    2. Quarto disponível
    4. Motivo da permanência
    5. Data e hora de saída
4. O sistema deve permitir o registro de saída da pessoa desocupando a cama/quarto usada por ela. O registro de desocupação/saída de um quarto é chamado de CHECKOUT. Essa operação informa a data e horário de saída do hospede.
5. O sistema deve mostrar quais pessoas estão com o prazo de permanência a vencer ou já vencidas e que ainda estão usufruindo de uma cama em um quarto.

### Requisitos para o controle de refeições
1. O sistema deve disponibilizar a manutenção de um cardápio. Esse cardápio deve ser identificado pelos seguintes dados:
    1. Identificação do cardápio
    2. Nome do cardápio. Nome utilizado para identificar visualmente o cardápio.
    3. Tipo do cardápio. Pode ser de 3 (três) tipos: Café da manhã, Almoço, Janta.
    4. Descrição do cardápio. Descritivo do que será servido no cardápio.
3. O sistema deve permitir o registro dos cardápios por dia. Esse registro deve ser identificado com os seguintes dados:
    1. Data: Data na qual o cardápio será disponibilizado
    2. Tipo do cardápio: identifica se o cardápio a ser disponibilizado será para o café da manhã, almoço ou janta
    3. Cardápio: identifica o cardápio a ser disponibilizado na data informada de acordo com o tipo do cardápio predeterminado
    4. Início: horário no qual o cardápio será servido
    5. Fim: horário no qual o cardápio será retirado
4. O sistema deve permitir que os cardápios possam ser registrados para um período predeterminado. Dessa forma é possível planejar a disponibilização as refeições por um período.
5. O sistema deve exigir que os hóspedes se identifiquem e registrem o consumo da refeição no momento em que o cárdápio estiver sendo oferecido.

## Requisitos de negócio
1. O sistema deve notificar notificar o administrador do albergue ou seus responsáveis quando identificar que uma pessoa que está usando uma cama em um quarto estiver com o prazo de permanência encerrando.
2. O sistema deve evitar que uma mesma pessoa utilize mais de um quarto em um mesmo período.
3. O sistema deve evitar que um quarto seja reservado além da sua capacidade de camas disponíveis para um mesmo período.
4. O sistema deve evitar que uma mesma pessoa seja cadastrada mais de uma vez no sistema. Para isso, deve utilizar o número do documento como dado de verificação de unicidade.
5. O sistema não deve permitir que uma pessoa tenha registrado o consumo de mais de uma refeição para o mesmo dia, horário e cardápio oferecidos pelo albergue.
6. O sistema deve permitir a INATIVAÇÃO de uma regra de permanência no albergue quando ela não puder ser excluída do sistema.
7. O sistema deve permitir a INATIVAÇÃO de um motivo de permanência no albergue quando ele não puder ser excluído do sistema.
8. O sistema deve permitir a INATIVAÇÃO de um quarto do albergue quando ele não puder ser excluído do sistema.
9. O sistema deve permitir que o quarto seja bloqueado para MANUTENÇÃO somente quando ele estiver disponível em um determinado período.
