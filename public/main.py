Fugue = {
    "Exposicion": {
        "Tema" : "T",
        "ContraTema": ["CT", "CT2"],
        "Entrada_Complementaria": "EC",
    },
    "Episodio": "",
    "Desarrollo": {
        "Tema": "T",
        "ContraTema": ["CT", "CT2"]
    },
    "Episodio": "",
    "Re_Exposicion": {
        "Tema": "T",
        "ContraTema": ["CT", "CT2"]
    },
    "Coda": "EC"
}

print(Fugue)

def print_fugue(fugue):
    for section, content in fugue.items():
        if isinstance(content, dict):
            print(f"{section}:")
            for sub_section, sub_content in content.items():
                if isinstance(sub_content, list):
                    print(f"  {sub_section}: {', '.join(sub_content)}")
                else:
                    print(f"  {sub_section}: {sub_content}")
        elif isinstance(content, list):
            print(f"{section}: {', '.join(content)}")
        else:
            print(f"{section}: {content}")

print_fugue(Fugue)