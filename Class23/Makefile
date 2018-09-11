RM=rm -rf
JAVAC=javac

SRC_DIR=./src
DOC_DIR=./doc
BIN_DIR=./bin

.PHONY: clean doc

all: quest1 quest2 quest3

quest1:
	$(JAVAC) $(SRC_DIR)/quest1/*.java -d $(BIN_DIR)

quest2:
	$(JAVAC) $(SRC_DIR)/quest2/*.java -d $(BIN_DIR) 

quest3:
	$(JAVAC) $(SRC_DIR)/quest3/*.java -d $(BIN_DIR) 

doc:
	javadoc -d ./doc/ -sourcepath ./src quest1 quest2 quest3

clean:
	$(RM) $(BIN_DIR)/quest1/*
	$(RM) $(BIN_DIR)/quest2/*
	$(RM) $(BIN_DIR)/quest3/*
	$(RM) $(DOC_DIR)/*